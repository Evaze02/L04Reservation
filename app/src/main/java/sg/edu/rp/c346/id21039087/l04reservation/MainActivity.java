package sg.edu.rp.c346.id21039087.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnReset;
    Button btnConfirm;
    CheckBox cbSmoke;
    CheckBox cbNonSmoke;
    EditText name;
    EditText number;
    EditText groupSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnReset = findViewById(R.id.buttonReset);
        btnConfirm = findViewById(R.id.buttonConfirm);
        cbSmoke = findViewById(R.id.checkBoxSmoke);
        cbNonSmoke = findViewById(R.id.checkBoxNonSmoke);
        name = findViewById(R.id.editTextName);
        number = findViewById(R.id.editTextPhone);
        groupSize = findViewById(R.id.editTextGroup);

        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);
        dp.updateDate(2020,05,01);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, (CharSequence) "All reservation information should be displayed",
                        Toast.LENGTH_SHORT).show();
            }
        });

        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
                dp.updateDate(2020,05,01);
                cbNonSmoke.setChecked(false);
                cbSmoke.setChecked(false);
                name.setText("");
                number.setText("");
                groupSize.setText("");
            }
        });
    }
}