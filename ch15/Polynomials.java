import java.util.*;

public class Polynomials {
    private LinkedList<Term> list;
    private ListIterator<Term> iter;


    public Polynomials(Term t) {
        list = new LinkedList<Term>();
        iter = list.listIterator();
        list.add(t);
    }

    public Polynomials() {
        list = new LinkedList<Term>();
        iter = list.listIterator();
    }


    public void add(Term d) {
        boolean placed = false;

        while(iter.hasNext() && !placed) {
            Term t = Iter.next();
            if(t.expo == d.expo) {
                iter.set(new Term(t.coe + d.coe, t.expo));
                placed = true;
            } else if(d.epo > t.expo) {
                iter.previous();
                iter.add(d);
            }
        }

        if(iter.hasNext() && !placed) {
            list.add(d);
        }
    }

    public Polynomials multiply(Polynomials p) {
        Polynomials q = this;
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < p.size(); j++) {
                q.add(iter.next().times(p.next()));
                p.previous();
            }
            p.next();
        }
        return q;
    }

    public int size() {
        return list.size();
    }

    public Term next() {
        return iter.next();
    }

    public term previous() {
        return iter.previous();
    }

    public void print() {
        for(Term s : list) {
            System.out.println(s);
        }
    }
}
