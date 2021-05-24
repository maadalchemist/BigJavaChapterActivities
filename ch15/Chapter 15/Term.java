public class Term {
    public int coe;
    public int expo;


    public Term(int x, int y) {
        coe = x;
        expo = y;
    }


    public void print() {
        if(coe == 0) {
            System.out.print("0");
        } else {
            System.out.print(coe + "x^" + expo);
        }
    }

    public Term times(Term t) {
        return new Term(this.coe * t.coe, this.expo + t.expo);
    }
}
