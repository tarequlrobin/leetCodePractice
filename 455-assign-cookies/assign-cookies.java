class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gindx = g.length-1;
        int sindx = s.length-1;
        int cnt = 0;

        for(int i = gindx; i >= 0; i--){
            if(sindx<0){
                break;
            }
            if(g[i] <= s[sindx]){
                cnt++;
                sindx--;
            }
        }
        return cnt;
    }
}