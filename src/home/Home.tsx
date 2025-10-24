import { PostCard } from "../posts/PostCard";
import { posts } from "../posts/repo/postRepo";

import "./home.css";

export const Home = () => {
    return (
        <div className="homePostContainer">
            {posts.map( postData => <PostCard {...postData} />)}
        </div>
    );
}