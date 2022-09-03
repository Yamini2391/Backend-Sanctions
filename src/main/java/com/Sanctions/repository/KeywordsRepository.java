package com.Sanctions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sanctions.model.Keywords;
import com.Sanctions.model.keywordId;

public interface KeywordsRepository extends JpaRepository<Keywords, keywordId> {

}
