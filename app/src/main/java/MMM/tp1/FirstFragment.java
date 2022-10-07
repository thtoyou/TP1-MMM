package MMM.tp1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.Calendar;

import MMM.tp1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    DatePickerDialog datePickerDialog;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        setHasOptionsMenu(true);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.editTextPersonBirthDate.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(FirstFragment.this.getContext(),
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                binding.editTextPersonBirthDate.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        }));

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = binding.editTextPersonFirstName.getText().toString();
                String name = binding.editTextPersonName.getText().toString();
                String bDay = binding.editTextPersonBirthDate.getText().toString();
                String place = binding.editTextPersonBirthPlace.getText().toString();
                String content = fName + name + "né(e) le " + bDay + "à " + place;
                Toast.makeText(getContext().getApplicationContext(), content, Toast.LENGTH_LONG).show();
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }

        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present.
        inflater.inflate(R.menu.menu_fragment_first, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_clear) {
            this.binding.editTextPersonBirthDate.setText("");
            this.binding.editTextPersonBirthPlace.setText("");
            this.binding.editTextPersonFirstName.setText("");
            this.binding.editTextPersonName.setText("");
        }
        if (id == R.id.action_tel) {
            int visibility = this.binding.editTextNumber.getVisibility();
            if (visibility == View.VISIBLE) {
                this.binding.editTextNumber.setVisibility(View.GONE);
            } else {
                this.binding.editTextNumber.setVisibility(View.VISIBLE);
            }
        }
        if (id == R.id.action_wiki) {

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://fr.wikipedia.org/wiki/" + this.binding.editTextPersonBirthPlace.getText().toString()));
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}