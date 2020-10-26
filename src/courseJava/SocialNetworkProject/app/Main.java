package courseJava.SocialNetworkProject.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import courseJava.SocialNetworkProject.entities.Comment;
import courseJava.SocialNetworkProject.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("\nEnter with your post: ");
		System.out.print("Moment: ");
		Date moment = sdf.parse(sc.nextLine());
		System.out.println("Title: ");
		String title = sc.nextLine();
		System.out.print("Content: ");
		String content = sc.nextLine();
		System.out.print("Likes: ");
		int likes = sc.nextInt();
		Post post = new Post(moment, title, content, likes);
		
		sc.nextLine();
		System.out.print("Comment: ");
		Comment comment0 = new Comment(sc.nextLine());
		
		System.out.print("Comment: ");
		Comment comment1 = new Comment(sc.nextLine());
		
		post.addComment(comment0);
		post.addComment(comment1);
		
		//---------------------------------------------------------
		Post post0 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys",
				"See you tomorrow",
				5);
		
		Comment comment2 = new Comment("Good night");
		Comment comment3 = new Comment("May be force be with you");

		
		post0.addComment(comment2);
		post0.addComment(comment3);
		
		//---------------------------------------------------------
		
		System.out.println(post);
		System.out.println("--------------");
		System.out.println(post0);
		sc.close();
	}

}
