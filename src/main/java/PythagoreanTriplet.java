import java.util.ArrayList;
import java.util.List;
class PythagoreanTriplet{
    int a;
    int b;
    int c;
    public PythagoreanTriplet(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static TripletBuilder makeTripletsList(){
        return new TripletBuilder();
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        PythagoreanTriplet pt = (PythagoreanTriplet) obj;
        return (this.a == pt.a && this.b == pt.b && this.c == pt.c);
    }
    public static class TripletBuilder{
        int sum;
        public TripletBuilder withFactorsLessThanOrEqualTo(int sum){
            return this;
        }
        public TripletBuilder thatSumTo(int sum){
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build(){
            List<PythagoreanTriplet> listOfTriplet = new ArrayList<PythagoreanTriplet>();
            for(int a = 1 ; a < sum ; a++){
                for(int b = a + 1 ; b < sum; b++) {
                    if(a + b > sum){
                        break;
                    }
                    if(Math.pow(a,2) + Math.pow(b,2) == Math.pow((sum - (a + b)),2) ){
                        listOfTriplet.add(new PythagoreanTriplet(a, b, sum-(a+b)));
                    }
                }
            }
            return listOfTriplet;
        }
    }
}