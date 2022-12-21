package com.sda.eventapp.service;

import com.sda.eventapp.model.Comment;
import com.sda.eventapp.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;

    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> findByEventId(Long id) {
        return commentRepository.findAllByEvent_IdOrderByWritingDateDesc(id);
    }
}
