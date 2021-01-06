public class Printer {
    private int numOfPages;
    private int tonerVolume;

    public Printer (int numOfPages, int tonerVolume) {
        this.numOfPages = numOfPages;
        this.tonerVolume = tonerVolume;
    }

    public int getNumOfPages() {return this.numOfPages;}

    public int getTonerVolume() {return this.tonerVolume;}

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.numOfPages >= totalPages)  {
            this.numOfPages -= totalPages;
            tonerVolume -= totalPages;
        } else {
            ;
        }
    }
}
