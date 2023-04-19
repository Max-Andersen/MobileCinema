package com.example.mobile_cinema_lab1.domain.usecases

import com.example.mobile_cinema_lab1.domain.repositoryinterfaces.ICollectionRepository
import com.example.mobile_cinema_lab1.repositories.CollectionRepository

class GetMoviesInCollectionUseCase(private val collectionId: String) {
    private val collectionRepository: ICollectionRepository = CollectionRepository()

    operator fun invoke() = collectionRepository.getMoviesInCollection(collectionId)

}