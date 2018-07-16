package sg.edu.rp.c346.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmath;
    ArrayList<Mathitem> alMathlist;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmath = findViewById(R.id.listViewmath);
        alMathlist = new ArrayList<>();

        Mathitem math1 = new Mathitem("Area of rectangle","Length x Length","Formula type is: Area");
        Mathitem math2 = new Mathitem("Area of triangle","(Length of base x Length)/2","Formula type is: Area");
        Mathitem math3 = new Mathitem("volume of cube","Length x Length x Length","Formula type is: volume");

        alMathlist.add(math1);
        alMathlist.add(math2);
        alMathlist.add(math3);

        caMath = new CustomAdapter(this, R.layout.math_item, alMathlist);

        lvmath.setAdapter(caMath);

    }
}
