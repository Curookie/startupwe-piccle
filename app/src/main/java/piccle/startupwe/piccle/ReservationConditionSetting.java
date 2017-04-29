package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Spinner;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.NumberPicker;
import android.widget.Toast;


public class ReservationConditionSetting extends AppCompatActivity {
    private Spinner shootSelection, countrySelection, citySelection, pinPointSelection, costSelection;
    private Button BconditionSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition_setting);

        shootSelection = (Spinner)findViewById(R.id.shootSpinner);
        countrySelection = (Spinner)findViewById(R.id.countrySpinner);
        citySelection = (Spinner)findViewById(R.id.citySpinner);
        pinPointSelection = (Spinner)findViewById(R.id.pinPointSpinner);
        costSelection = (Spinner) findViewById(R.id.costSpinner);

        ArrayAdapter shootAdapter = ArrayAdapter.createFromResource(this, R.array.shootArray, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter countryAdapter = ArrayAdapter.createFromResource(this, R.array.countryArray, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter cityAdapter = ArrayAdapter.createFromResource(this, R.array.cityArray, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter pinPointAdapter = ArrayAdapter.createFromResource(this, R.array.pinPointArray, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter costAdapter = ArrayAdapter.createFromResource(this, R.array.costArray, android.R.layout.simple_spinner_dropdown_item);

        shootSelection.setAdapter(shootAdapter);
        countrySelection.setAdapter(countryAdapter);
        citySelection.setAdapter(cityAdapter);
        pinPointSelection.setAdapter(pinPointAdapter);
        costSelection.setAdapter(costAdapter);

        BconditionSetting = (Button) findViewById(R.id.conditionSettingButton);
        BconditionSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReservationConditionSetting.this, ShowGiverListActivity.class);
                startActivity(intent);
            }
        });
    }
}
