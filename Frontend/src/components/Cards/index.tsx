
export type Props = {
    imageSrc: string;
    title: string;
    description: string
}
const Card = (props: Props) => {
    const { imageSrc, title, description } = props
    return (
        <div className="max-w-sm rounded overflow-hidden shadow-lg m-4">
            <img className="w-full h-48 object-cover" src={imageSrc} alt={title} />
            <div className="px-6 py-4">
                <div className="font-bold text-xl mb-2">{title}</div>
                <p className="text-gray-700 text-base">{description}</p>
            </div>
        </div>
    );
};

export { Card };