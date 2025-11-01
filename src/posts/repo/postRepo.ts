
import post1 from "./how-i-became.md";
import profile from "./profile.md";
import post2 from "./good-dev-practices.md";
import post3 from "./declarative-ui-android.md";
import post4 from "./hiring-experiences.md";

export const postsMap: Record<string, string> = {
    "how-i-became": post1,
    "profile": profile,
    "good-dev-practices": post2,
    "declarative-ui-android": post3,
    "hiring-experiences": post4,
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

const declarativeUI = {
    title: "Declarative UI in Android",
    description: "An introduction to declarative UI in Android using Jetpack Compose.",
    imageUrl: "/logo192.png",
    route: "/post/declarative-ui-android"
};

const hiringExp = {
    title: "My Hiring Experiences",
    description: "Sharing my experiences during the hiring process, including interviews and assessments.",
    imageUrl: "/logo192.png",
    route: "/post/hiring-experiences"
};

export const posts = [softEng, goodPracts, declarativeUI, hiringExp];
