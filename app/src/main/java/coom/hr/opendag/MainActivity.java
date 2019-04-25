package coom.hr.opendag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    private RecyclerView rv;
    private boolean ignoreFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init recyclerview
        // Lookup the recyclerview in activity layout
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv = findViewById(R.id.rv);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(rv.getContext(), linearLayoutManager.getOrientation());
        rv.addItemDecoration(dividerItemDecoration);

        spinner = findViewById(R.id.spinner);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> parent, View view,  int pos, long id) {

                    if (ignoreFirst) {
                        ignoreFirst = false;
                        return;
                    }

                    rv.setVisibility(View.VISIBLE);

                    // Create adapter passing in the sample user data
                    MainListAdapter adapter = new MainListAdapter(ActivityData.generateData(parent.getItemAtPosition(pos).toString()));
                    // Attach the adapter to the recyclerview to populate items
                    rv.setAdapter(adapter);
                    // Set layout manager to position the items
                    rv.setLayoutManager(linearLayoutManager);

                }

                @Override
                public void onNothingSelected(AdapterView<?> parentView) {
                    // your code here
                }
            });


        }
    }

