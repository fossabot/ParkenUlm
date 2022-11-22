package development.parkenulm;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.function.UnaryOperator;


public class ParkhausListAdapter extends BaseAdapter {
    private ArrayList<Parkhaus> ph_data;

    public ParkhausListAdapter(ArrayList<Parkhaus> ph_data) {
        this.ph_data = ph_data;
    }

    public void updateData(ArrayList<Parkhaus> newData) {
        //this.ph_data.clear();
        //this.ph_data.replaceAll((UnaryOperator<Parkhaus>) newData);
        //this.ph_data.addAll(newData);
        ph_data = newData;
        notifyDataSetChanged();
    }

    /**
     * This method returns the number of items in the list.
     *
     * @return The number of items in the list.
     */
    @Override
    public int getCount() {
        return ph_data.size();
    }

    /**
     * This method returns the item at the given position.
     *
     * @param i The position of the item.
     * @return The item at the given position.
     */
    @Override
    public Object getItem(int i) {
        return ph_data.get(i);
    }

    /**
     * This method returns the item id at the given position.
     *
     * @param i The position of the item.
     * @return i.
     */
    @Override
    public long getItemId(int i) {
        return i;
    }


    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Parkhaus db = ph_data.get(i);
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.ph_list_view_item, null, false);
        }
        TextView parkhaus_Name = view.findViewById(R.id.ParkhausListItemName);
        parkhaus_Name.setText(db.getHaus());
        TextView parkhaus_Plaetze = view.findViewById(R.id.ParkhausListItemPlaetze);
        parkhaus_Plaetze.setText(db.getPlatz());
        TextView parkhaus_Frei = view.findViewById(R.id.ParkhausListItemFreiePlaetze);
        //checkFreePlaces(db.getFrei(), parkhaus_Frei);
        //Log.d("ParkhausListAdapter", "getView: " + db.getFrei());
        parkhaus_Frei.setText(db.getFrei());
        return view;
    }
    //public void checkFreePlaces(String checkString, TextView view)
    //{
    //    if(checkString.matches("\\d+") && !view.getText().toString().contains("Bahnhof")){
    //        int places = Integer.parseInt(checkString);
    //        //Log.d("checkFreePlaces", "places" + places);
    //        if(places < 20)
    //        {
    //            Log.d("checkFreePlaces", "places < 10   "+ places+ view.getText());
    //            view.setTextColor(Color.RED);
    //            view.setText(checkString);
    //        }
    //        else view.setText(checkString);
    //    }
    //    else {
    //        view.setTextColor(Color.BLUE);
    //        view.setText(checkString);
    //        view.setBackgroundColor(Color.YELLOW);
    //    }
    //}
}