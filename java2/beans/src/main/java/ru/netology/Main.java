package ru.netology;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.netology.controller.PostController;
import ru.netology.service.PostService;

public class Main {
  public static void main(String[] args) {

    try (var context = new AnnotationConfigApplicationContext("ru.netology")) {

      PostController controller = context.getBean(PostController.class);

      PostService service = context.getBean(PostService.class);

      boolean isSame = service == context.getBean(PostService.class);
      System.out.println("Тот же экземпляр PostService: " + isSame);

    }
  }
}