"use client";

import Link from "next/link";
import { usePathname, useRouter } from "next/navigation";
import { LogOut, Settings } from "lucide-react";

import { cn } from "@/lib/utils";
import { RepoMindIcon } from "../icons/repomind-icon";

export function BrandMark({ className }: { className?: string }) {
  return (
    <div
      className={cn(
        "flex items-center gap-2.5 font-semibold tracking-tight",
        className
      )}
    >
      <RepoMindIcon className="size-8 rounded-[10px]" />
      <span className="font-heading text-[1.05rem] leading-none">DevPilot</span>
    </div>
  );
}