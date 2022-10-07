package MMM.tp1;

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
            notifyPropertyChanged(BR.name);
}}
