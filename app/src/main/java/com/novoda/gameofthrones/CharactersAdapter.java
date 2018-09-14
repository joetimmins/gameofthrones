package com.novoda.gameofthrones;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CharactersAdapter extends RecyclerView.Adapter<GenericViewHolder> {
    private Context context;
    private final List<Character> characters;

    private static final List<Integer> backgroundColours = new ArrayList<>(
            Arrays.asList(
                    R.color.orange50,
                    R.color.orange100,
                    R.color.orange200,
                    R.color.orange300,
                    R.color.orange400,
                    R.color.orange500,
                    R.color.orange600,
                    R.color.orange700,
                    R.color.orange800,
                    R.color.orange900
            )
    );

    private int count = 0;

    CharactersAdapter(Context context, List<Character> characters) {
        this.context = context;
        this.characters = characters;
    }

    @NonNull
    @Override
    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CharacterView characterView = new CharacterView(context);
        characterView.setBackgroundResource(backgroundColours.get(count));

        count++;

        characterView.getViewHolderNumberView().setText("this is view holder number: " + count);
        count++;

        return new GenericViewHolder(characterView);
    }

    @Override
    public void onBindViewHolder(@NonNull GenericViewHolder holder, int position) {
        CharacterView itemView = (CharacterView) holder.itemView;
        TextView tvCharacterName = itemView.getCharacterNameView();
        final Character character = characters.get(position);
        tvCharacterName.setText(character.getName());
        tvCharacterName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(character.getWikipediaUrl()));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }
}
