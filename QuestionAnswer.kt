package com.example.quizapp

class QuestionAnswer {

    companion object {
        val questions = arrayOf(
            "What is the capital of Australia?",
            "Which river is the longest in the world?",
            "Which mountain range runs along the northern border of India?",
            "Which country is known as the 'Land of the Rising Sun'?",
            "What is the largest desert in the world?"
        )

        val choices = arrayOf(
            arrayOf("Sydney", "Melbourne", "Canberra", "Perth"),
            arrayOf("Nile", "Amazon", "Yangtze", "Mississippi"),
            arrayOf("Andes", "Rocky Mountains", "Himalayas", "Alps"),
            arrayOf("China", "Japan", "South Korea", "Thailand"),
            arrayOf("Sahara", "Arabian", "Gobi", "Kalahari")
        )

        val correctAnswers = arrayOf(
            "Canberra",
            "Nile",
            "Himalayas",
            "Japan",
            "Sahara"
        )
    }
}
