package development.parkenulm;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ParkhausListAdapter extends BaseAdapter {
    private ArrayList<Parkhaus> ph_data;

    public ParkhausListAdapter(ArrayList<Parkhaus> ph_data) {
        this.ph_data = ph_data;
    }

    public void updateData(ArrayList<Parkhaus> newData) {
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
        parkhaus_Frei.setText(db.getFrei());
        Colorize(parkhaus_Frei, parkhaus_Plaetze, parkhaus_Name, db.getFrei(), db.getPlatz());
        return view;
    }

    public void Colorize(TextView parkhaus_Frei, TextView parkhaus_Plaetze, TextView parkhaus_Name, String frei, String platz) {
        Thread thread = new Thread(() -> {
            if (frei.matches("[0-9]*")) {
                int freiInt = Integer.parseInt(frei);
                int platzInt = Integer.parseInt(platz);
                boolean quater = freiInt < platzInt / 4;
                parkhaus_Frei.getTag(R.color.black);
                if (freiInt < 30) {
                    parkhaus_Frei.setTextColor(Color.RED);
                } else if (freiInt > 30 && quater) {
                    parkhaus_Frei.setTextColor(Color.YELLOW);
                }
            } else {
                parkhaus_Frei.setTextColor(Color.DKGRAY);
                parkhaus_Plaetze.setTextColor(Color.DKGRAY);
                parkhaus_Name.setTextColor(Color.DKGRAY);
            }
        });
        thread.start();
    }
}