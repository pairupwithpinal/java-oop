public class LibraryMamber {
    private String street_name;
    private int street_num;

    private Mamber mamber;

    public Mamber getMamber() {
        return mamber;
    }

    public void setMamber(Mamber mamber) {
        this.mamber = mamber;
    }

    private boolean library_card;

    public LibraryMamber(String street_name, int street_num) {

        this.street_name = street_name;
        this.street_num = street_num;
    }

    public boolean isLibrary_card() {
        return library_card;
    }

    public void setLibrary_card(boolean library_card) {
        this.library_card = library_card;
    }

    public boolean isMamber(Mamber mamber) {
        if (street_name != null && street_num != 0) {


            if (mamber.getLicence_num() != 0 && mamber.getLibrary_card() != 0) {
            }

            return library_card;
        }
        return isMamber(mamber);
    }


}