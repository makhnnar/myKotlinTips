import { PostCard } from "../posts/PostCard";
import { posts } from "../posts/repo/postRepo";

export const Home = () => {
    return (
        <div>
            <h2>Home Page</h2>
            {posts.map( postData => <PostCard {...postData} />)}
        </div>
    );
}