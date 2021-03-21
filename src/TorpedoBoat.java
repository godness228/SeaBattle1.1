public class TorpedoBoat extends Ships {

    int counter = 0;

    @Override
    public int placeOnField() {
        return  counter;
    }
}
