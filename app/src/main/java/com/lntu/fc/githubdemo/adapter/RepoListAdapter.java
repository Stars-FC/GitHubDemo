package com.lntu.fc.githubdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lntu.fc.githubdemo.R;
import com.lntu.fc.githubdemo.mvp.bean.Repo;
import com.lntu.fc.githubdemo.utils.PicassoUtil;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by FengChen on 2019/9/1.
 */
public class RepoListAdapter extends RecyclerView.Adapter<RepoListAdapter.ViewHolder> {

    private Context mContext;
    private Repo mRepos;

    public RepoListAdapter(Context context, Repo repo) {
        mContext = context;
        mRepos = repo;
    }

    /**
     * 更新数据并刷新视图
     *
     * @param repo 数据
     */
    public void setRepoList(Repo repo) {
        this.mRepos = repo;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.repo_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        List<Repo.ItemsBean> items = mRepos.getItems();

        holder.title.setText(items.get(position).getFull_name());
        holder.description.setText(items.get(position).getDescription());
        holder.meta.setText(items.get(position).getStargazers_count() + " stars");

        // TODO: 2019/9/1 加载作者头像
        PicassoUtil.loadImageView(items.get(position).getOwner().getAvatar_url(), holder.avatar1);
    }

    @Override
    public int getItemCount() {
        return mRepos.getItems().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Repo mRepo;
        private List<CircleImageView> avatars;

        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.description)
        TextView description;
        @BindView(R.id.meta)
        TextView meta;
        @BindView(R.id.star)
        ImageView starImage;

        @BindView(R.id.avatar1)
        CircleImageView avatar1;
        @BindView(R.id.avatar2)
        CircleImageView avatar2;
        @BindView(R.id.avatar3)
        CircleImageView avatar3;
        @BindView(R.id.avatar4)
        CircleImageView avatar4;
        @BindView(R.id.avatar5)
        CircleImageView avatar5;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

//            avatars = new ArrayList<>();
//            avatars.add(avatar1);
//            avatars.add(avatar2);
//            avatars.add(avatar3);
//            avatars.add(avatar4);
//            avatars.add(avatar5);

            // TODO: 2019/9/1 点击事件
        }
    }
}
