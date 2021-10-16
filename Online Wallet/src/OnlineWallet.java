public abstract class OnlineWallet {
    int amount;
    PlaceAdapter place;

    abstract void setAmount(int amount);

    public int calculateMoney(int units){
        return units*amount;
    }
}

