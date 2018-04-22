package io.github.fahmifan.askara;

import android.view.LayoutInflater;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AksaraAdapter extends ArrayAdapter<Aksara> {

    private List<Aksara> aksaraList = new ArrayList<>();


    public AksaraAdapter(@NonNull Context context, ArrayList<Aksara> aksaras) {
        super(context, 0, aksaras);
        aksaraList = aksaras;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being used
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Aksara currentAksara = this.aksaraList.get(position);

        // Find the TextView in the list_item.xml layout with ID aksara_text_view
        TextView aksaraTextView = (TextView) listItemView.findViewById(R.id.aksara_text_view);

        // Get the aksara word and place it in the set on the TextView
        aksaraTextView.setText(currentAksara.getmAksaraWord());

        // Find the ImageView of the current layout
        ImageView aksaraImageView = (ImageView) listItemView.findViewById(R.id.image_askara);

        if(currentAksara.isHasImage()) {
            // Inject the R.id to the current ImageView
            aksaraImageView.setImageResource(currentAksara.getmImageResourceId());
            aksaraImageView.setVisibility(View.VISIBLE);
        } else {
            aksaraImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
