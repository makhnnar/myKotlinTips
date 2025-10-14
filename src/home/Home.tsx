import { posts, PostCard } from "../posts/PostCard";

export const Home = () => {
    return (
        <div>
            <h2>Home Page</h2>
            {posts.map( postData => <PostCard {...postData} />)}
        </div>
    );
}