package sg.edu.rp.c346.quiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020089 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<Mathitem> mathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Mathitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        mathList = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent, false );
        TextView tvname = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewFormuler);
        TextView tvtype = rowView.findViewById(R.id.type);

        Mathitem currentItem = mathList.get(position);

        String name = currentItem.getName();
        String date = currentItem.getFormuler();
        String type = currentItem.getType();
        tvname.setText(name);
        tvDate.setText(date);
        tvtype.setText(type);
        return rowView;

    }

}
