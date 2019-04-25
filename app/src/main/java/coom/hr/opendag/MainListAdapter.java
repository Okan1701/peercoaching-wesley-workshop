package coom.hr.opendag;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.MyViewHolder> {
    private ActivityData[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtName;
        public TextView txtDate;
        public MyViewHolder(View v) {
            super(v);
            txtName = v.findViewById(R.id.rowActivityName);
            txtDate = v.findViewById(R.id.rowActivityDate);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MainListAdapter(ActivityData[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MainListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View rowView = inflater.inflate(R.layout.recycler_row, parent, false);

        // Return a new holder instance
        MyViewHolder viewHolder = new MyViewHolder(rowView);
        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.txtName.setText(mDataset[position].getName());
        holder.txtDate.setText(mDataset[position].getDate());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
