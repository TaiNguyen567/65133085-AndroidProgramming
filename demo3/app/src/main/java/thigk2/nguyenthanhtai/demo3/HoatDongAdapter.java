package thigk2.nguyenthanhtai.demo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

//import thigk2.nguyenthanhtai.demo3.R;

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.HoatDongViewHolder> {

    private Context mContext;
    private List<HoatDong> mListHoatDong;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(HoatDong hoatDong);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public HoatDongAdapter(Context mContext, List<HoatDong> mListHoatDong) {
        this.mContext = mContext;
        this.mListHoatDong = mListHoatDong;
    }

    @NonNull
    @Override
    public HoatDongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.activity_hoat_dong , parent, false);
        return new HoatDongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoatDongViewHolder holder, int position) {
        HoatDong hoatDong = mListHoatDong.get(position);
        if (hoatDong == null) return;

        holder.imgHinhAnh.setImageResource(hoatDong.getHinhAnh());
        holder.tvTieuDe.setText(hoatDong.getTieuDe());
        holder.tvThoiGian.setText(hoatDong.getThoiGian());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onItemClick(hoatDong);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mListHoatDong != null ? mListHoatDong.size() : 0;
    }

    public static class HoatDongViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHinhAnh;
        TextView tvTieuDe;
        TextView tvThoiGian;

        public HoatDongViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHinhAnh = itemView.findViewById(R.id.imgHinhAnh);
            tvTieuDe = itemView.findViewById(R.id.tvTieuDe);
            tvThoiGian = itemView.findViewById(R.id.tvThoiGian);
        }
    }
}