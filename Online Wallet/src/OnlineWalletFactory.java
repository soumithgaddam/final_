/**
 * This class implements the factory design pattern
 */

public class OnlineWalletFactory {
    public OnlineWallet getItem(String currency, String place){
        if(currency == null){
            return null;
        }
        if(currency.equalsIgnoreCase("Country")) {
            OnlineWallet g= new Country();
            ((Country) g).selectPlace(place);
            return g;
        }
        else if(currency.equalsIgnoreCase("Currency")){
            OnlineWallet g= new Currency();
            ((Currency) g).selectPlace(place);
            return g;
        }
        else if(currency.equalsIgnoreCase("Type")) {
            OnlineWallet g= new Type();
            ((Type) g).selectPlace(place);
            return g;
        }
        return null;
    }
}