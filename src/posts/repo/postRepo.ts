
import post1 from "./how-i-became.md";
import profile from "./profile.md";
import post2 from "./good-dev-practices.md";

export const postsMap: Record<string, string> = {
    "how-i-became": post1,
    "profile": profile,
    "good-dev-practices": post2,
    // Add more posts here as needed
};

const softEng = {
    title: "How I Became a Software Engineer",
    description: "A short story about my journey into software engineering, the challenges I faced, and all the people that helps to it.",
    imageUrl: "/logo192.png",
    route: "/post/how-i-became"
};

const goodPracts = {
    title: "Good Development Practices",
    description: "Things that I've learned over the years that can help you become a better sofware engineer.",
    imageUrl: "/logo192.png",
    route: "/post/good-dev-practices"
};

export const posts = [softEng, goodPracts, softEng];
