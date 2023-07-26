class Solution:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
        lo=1
        hi=int(1e7)
        result=-1
        while(lo<=hi):
            mid=lo+(hi-lo)//2
            if(self.sol(dist,mid)<=hour):
                result=mid
                hi=mid-1
            else:
                lo=mid+1
        return result
        
            
        
    def sol(self, dist: List[int], speed:int):
        time=0.0
        i=0
        while(i<len(dist)-1):
            time+=math.ceil(dist[i]*1.0/speed)
            i+=1
        time+=dist[i]/speed
        return time
        