public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String st = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        int c = 0;
        for (int i = 0; i < 32; i++) {
            if (st.charAt(i) == '1') {
                c += 1;
            }
        }
        return c;
    }
}
