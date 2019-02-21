package com.shannon.student.shannonsmuseumofcharacters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CharacterAdapter extends ArrayAdapter<Character> {
    public CharacterAdapter(Context context, ArrayList<Character> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.character_list_item, parent, false);
        Character currentCharacter = getItem(position);
        ImageView characterImage = convertView.findViewById(R.id.character_image);
        characterImage.setImageResource(currentCharacter.getCharcaterPic());
        TextView characterName = convertView.findViewById(R.id.character_name);
        characterName.setText(currentCharacter.getCharcterName());

        return convertView;
    }
}
