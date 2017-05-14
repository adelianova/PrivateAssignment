package id.sch.smktelkom_mlg.privateassignment.xirpl601.individu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by intel on 13/05/2017.
 */

public class NowAdapter extends RecyclerView.Adapter<NowAdapter.ViewHolder> {
    private List<NowItem> nowItemList;
    private Context context;

    public NowAdapter(List<NowItem> nowItemList, Context context) {
        this.nowItemList = nowItemList;
        this.context = context;
    }

    @Override
    public NowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.now_item, parent, false);
        return new NowAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NowAdapter.ViewHolder holder, final int position) {
        final NowItem nowItem = nowItemList.get(position);
        holder.tvTitle.setText(nowItem.getTitle());
        Glide
                .with(context)
                .load("http://image.tmdb.org/t/p/w500" + nowItem.getImageUrl())
                .into(holder.ivData);

        holder.rLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, nowItem.getTitle() + " selected", Toast.LENGTH_LONG).show();
                Intent singleBlogIntent = new Intent(context, TopDetailActivity.class);
                singleBlogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                singleBlogIntent.putExtra("blog_id", position);
                context.startActivity(singleBlogIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nowItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivData;
        public TextView tvTitle;
        public TextView tvDesc;
        public RelativeLayout rLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            ivData = (ImageView) itemView.findViewById(R.id.imageViewData);
            tvTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
            tvDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            rLayout = (RelativeLayout) itemView.findViewById(R.id.LinearLayout);
        }
    }
}

