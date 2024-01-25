package com.automated.trading.stock.StockManager.stock.post.qna;

import com.automated.trading.stock.StockManager.stock.post.qna.dto.QnaDeleteRequestDto;
import com.automated.trading.stock.StockManager.stock.post.qna.dto.QnaListResponseDto;
import com.automated.trading.stock.StockManager.stock.post.qna.dto.QnaSaveRequestDto;
import com.automated.trading.stock.StockManager.stock.post.qna.dto.QnaUpdateRequestDto;

import java.util.List;

public interface QnaService {

    void saveQna(QnaSaveRequestDto dto);

    void updateQna(QnaUpdateRequestDto dto);

    void deleteQna(QnaDeleteRequestDto dto);

    List<QnaListResponseDto> findAllQnas();

    QnaListResponseDto findById(int qna_id);

}
