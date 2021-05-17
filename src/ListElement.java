public class ListElement {

    private final String str;
    private ListElement next;

    public ListElement(String str) {
        this.str = str;
    }

    public String getStr(){
    return this.str;
    }


    public ListElement getNext() {
        return next;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

}
