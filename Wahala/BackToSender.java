public class BackToSender {
    public static int getRiderWages(int numberOfParcelDelivered) {
        int basePay = 5000;
        int amountPerParcel;

        if (numberOfParcelDelivered < 50)
            amountPerParcel = 160;
        else if (numberOfParcelDelivered < 60)
            amountPerParcel = 200;
        else if (numberOfParcelDelivered < 70)
            amountPerParcel = 250;
        else
            amountPerParcel = 500;

        return basePay + numberOfParcelDelivered * amountPerParcel;
    }
}
