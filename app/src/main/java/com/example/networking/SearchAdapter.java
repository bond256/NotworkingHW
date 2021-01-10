package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networking.model.video.SearchData;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    private SearchData listVideos;

    public SearchAdapter(SearchData videos) {
        listVideos = videos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.search_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(listVideos.getData().getVideo().getData().get(position).getTitle()!=null)
        holder.getTextName().setText(listVideos.getData().getVideo().getData().get(position).getTitle());
        else holder.getTextName().setText("information not available");
        if(listVideos.getData().getVideo().getData().get(position).getDescription()!=null)
        holder.getTextDiscription().setText(listVideos.getData().getVideo().getData().get(position).getDescription().toString());
        else holder.getTextDiscription().setText("information not available");
        if(listVideos.getData().getVideo().getData().get(position).getCountLikes()!=null)
        holder.getTextCountLikes().setText(listVideos.getData().getVideo().getData().get(position).getCountLikes());
        else holder.getTextCountLikes().setText("information not available");
    }

    @Override
    public int getItemCount() {
        return listVideos.getData().getVideo().getData().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView discription;
        private TextView countLikes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTitle);
            discription=itemView.findViewById(R.id.discription);
            countLikes=itemView.findViewById(R.id.count_likes);
        }

        public TextView getTextName() {
            return name;
        }
        public TextView getTextDiscription(){
            return discription;
        }

        public TextView getTextCountLikes(){
            return countLikes;
        }

    }
}
