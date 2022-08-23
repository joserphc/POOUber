class   Main{
    public static void main(String[]args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("A001", new Account("Joserph Camacho", "010201"), "Chevlolet", "Attitude");
        uberX.setPassenger(4);
        uberX.carDataPrint();

        UberVan uberVan = new UberVan("A002", new Account("Erika Gomez", "0204405"));
        uberVan.setPassenger(6);
        uberVan.carDataPrint();
    }
}