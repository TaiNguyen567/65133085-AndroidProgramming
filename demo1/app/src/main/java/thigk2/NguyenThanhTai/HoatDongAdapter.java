package thigk2.NguyenThanhTai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import thigk2.NguyenThanhTai.HoatDong; // Import lớp Model
import thigk2.NguyenThanhTai.R; // Import R

public class HoatDongAdapter extends RecyclerView.Adapter<HoatDongAdapter.HoatDongViewHolder> {

    private Context mContext;
    private List<HoatDong> mListHoatDong;

    // Interface để xử lý click
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
        // Tạo View từ layout item bạn đã thiết kế (ví dụ: item_hoat_dong.xml)
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_hoat_dong, parent, false);
        return new HoatDongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HoatDongViewHolder holder, int position) {
        HoatDong hoatDong = mListHoatDong.get(position);
        if (hoatDong == null) {
            return;
        }

        // Gán dữ liệu lên View
        holder.imgDaiDien.setImageResource(hoatDong.getHinhAnhDaiDien());
        holder.tvTieuDe.setText(hoatDong.getTieuDe());
        holder.tvThoiGian.setText(hoatDong.getThoiGian());

        // Bắt sự kiện click cho cả item (yêu cầu 0.5đ)
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
        if (mListHoatDong != null) {
            return mListHoatDong.size();
        }
        return 0;
    }

    // Lớp ViewHolder
    public static class HoatDongViewHolder extends RecyclerView.ViewHolder {
        ImageView imgDaiDien;
        TextView tvTieuDe;
        TextView tvThoiGian;

        public HoatDongViewHolder(@NonNull View itemView) {
            super(itemView);
            // Ánh xạ View từ layout 'item_hoat_dong.xml'
            imgDaiDien = itemView.findViewById(R.id.imageViewDaiDien); // Giả sử ID
            tvTieuDe = itemView.findViewById(R.id.textViewTieuDe); // Giả sử ID
            tvThoiGian = itemView.findViewById(R.id.textViewThoiGian); // Giả sử ID
        }
    }
}