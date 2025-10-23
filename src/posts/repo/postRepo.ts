
import post1 from "./how-i-became.md";

export const postsMap: Record<string, string> = {
    "how-i-became": post1,
    // Add more posts here as needed
};

const post = {
    title: "How I Became a Software Engineer",
    description: "A short story about my journey into software engineering, the challenges I faced, and all the people that helps to it.",
    imageUrl: "/logo192.png",
    postId: "how-i-became"
};

export const posts = [post, post, post];