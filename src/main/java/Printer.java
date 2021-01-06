public class Printer {
    private int numOfPages;
    private int numOfCopies;

    public Printer (int numOfPages, int numOfCopies) {
        this.numOfPages = numOfPages;
        this.numOfCopies = numOfCopies;
    }

    public int getNumOfPages() {return this.numOfPages;}

    public int getNumOfCopies() {return this.numOfCopies;}

    public void print(int numOfPages, int numOfCopies) {
        if (this.numOfPages > 0)  {
            numOfCopies ++;
            numOfPages --;
        } else {
            System.out.println("Not enough paper");

        }
    }
}
