package com.novoda.gameofthrones;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class CharactersAdapter extends RecyclerView.Adapter<GenericViewHolder> {
    private Context context;
    private final List<Character> characters;

    CharactersAdapter(Context context, List<Character> characters) {
        this.context = context;
        this.characters = characters;
    }

    @NonNull
    @Override
    public GenericViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CharacterView characterView = new CharacterView(context);

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
