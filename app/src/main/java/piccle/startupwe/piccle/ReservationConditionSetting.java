package piccle.startupwe.piccle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Spinner;


public class ReservationConditionSetting extends AppCompatActivity {
    private Spinner daySelection, monthSelection, yearSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition_setting);

        daySelection = (Spinner)findViewById(R.id.spinnerDay);
        monthSelection = (Spinner)findViewById(R.id.spinnerMonth);
        yearSelection = (Spinner) findViewById(R.id.spinnerYear);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.dayArray, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.monthArray, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.yearArray, android.R.layout.simple_spinner_item);
        yearSelection.setAdapter(adapter3);
        monthSelection.setAdapter(adapter2);
        daySelection.setAdapter(adapter1);
    }
}
