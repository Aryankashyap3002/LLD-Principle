import ProfileViewSelector from "./ProfileViewSelector.js"

const UserProfile = ({ user }) => {
    const ProfileView = ProfileViewSelector.getProfileView(user.role);
    return <ProfileView user={user}/>;;
}

export default UserProfile;