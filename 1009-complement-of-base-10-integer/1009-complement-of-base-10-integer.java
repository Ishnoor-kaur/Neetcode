class Solution {
    public int bitwiseComplement(int n) {
        int mask = 1;
        while ((mask & n) != n) {
            mask = mask << 1;
            mask += 1;
        }
        int res = mask ^ n;
        return res;
    }
}
