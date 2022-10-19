package mmm.tp1;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class ClientViewModel extends BaseObservable {
    private Client model;

    @Bindable
    public String getName() {
       return model.getName();
    }

    public void setName(String name) {
        this.model.setName(name);

    //BR.name is  automatically  generated
    notifyPropertyChanged(BR.name);}

        @Bindable
        public String getSurName() {
            return model.getSurname();
        }

        public void setSurName(String Surname) {
            this.model.setSurname(Surname);

            //BR.name is  automatically  generated
            notifyPropertyChanged(BR.surName);
}

    @Bindable
    public String getBDay() {
        return model.getBDay();
    }

    public void setBDay(String bDay) {
        this.model.setSurname(bDay);

        //BR.name is  automatically  generated
        notifyPropertyChanged(BR.bDay);
    }

    @Bindable
    public String getBirthPlace() {return model.getBirthPlace();}

    public void setBirthPlace(String bPlace) {
        this.model.setBirthPlace(bPlace);

        //BR.name is  automatically  generated
        notifyPropertyChanged(BR.birthPlace);
    }
    @Bindable
    public String getPhoneNumber() {return model.getPhoneNumber();}

    public void setPhoneNumber(String bPlace) {
        this.model.setBirthPlace(bPlace);

        //BR.name is  automatically  generated
        notifyPropertyChanged(BR.birthPlace);
    }

    public void setClient(Client client) {
        this.model= client;
    }
}
