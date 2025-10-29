package gk1.nguyenthanhtai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import gk1.nguyenthanhtai.R;

public class BaiThuocAdapter extends RecyclerView.Adapter<BaiThuocAdapter.BaiThuocViewHolder> {

    private Context mContext;
    private List<BaiThuoc> mListBaiThuoc;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(BaiThuoc baiThuoc);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public BaiThuocAdapter(Context mContext, List<BaiThuoc> mListBaiThuoc) {
        this.mContext = mContext;
        this.mListBaiThuoc = mListBaiThuoc;
    }

    @NonNull
    @Override
    public BaiThuocViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_bai_thuoc2, parent, false);
        return new BaiThuocViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BaiThuocViewHolder holder, int position) {
        BaiThuoc baiThuoc = mListBaiThuoc.get(position);
        if (baiThuoc == null) return;

        holder.imgBaiThuoc.setImageResource(baiThuoc.getHinhAnh());
        holder.tvTenBaiThuoc.setText(baiThuoc.getTenBaiThuoc());
        holder.tvMoTaBaiThuoc.setText(baiThuoc.getMoTa());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onItemClick(baiThuoc);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListBaiThuoc != null ? mListBaiThuoc.size() : 0;
    }

    public static class BaiThuocViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBaiThuoc;
        TextView tvTenBaiThuoc;
        TextView tvMoTaBaiThuoc;

        public BaiThuocViewHolder(@NonNull View itemView) {
            super(itemView);
            imgBaiThuoc = itemView.findViewById(R.id.imgBaiThuoc);
            tvTenBaiThuoc = itemView.findViewById(R.id.tvTenBaiThuoc);
            tvMoTaBaiThuoc = itemView.findViewById(R.id.tvMoTaBaiThuoc);
        }
    }
}